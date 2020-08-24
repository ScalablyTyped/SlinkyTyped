organization := "org.scalablytyped.slinky"
name := "randoma"
version := "1.3.0-39544b"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "color" % "3.0-dt-20200515Z-17533c",
  "org.scalablytyped.slinky" %%% "color-convert" % "1.9-dt-20200515Z-cb75b6",
  "org.scalablytyped.slinky" %%% "color-name" % "1.1-dt-20200515Z-e825e9",
  "org.scalablytyped.slinky" %%% "std" % "3.9-88d6d8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
