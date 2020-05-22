organization := "org.scalablytyped.slinky"
name := "eslint-plugin-react"
version := "7.20.0-21096f"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "eslint" % "6.8-dt-20200515Z-50bfdc",
  "org.scalablytyped.slinky" %%% "estree" % "0.0-unknown-dt-20200515Z-8cb760",
  "org.scalablytyped.slinky" %%% "json-schema" % "7.0-dt-20200515Z-9c1083",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
