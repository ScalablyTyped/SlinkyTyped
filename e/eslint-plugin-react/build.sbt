organization := "org.scalablytyped.slinky"
name := "eslint-plugin-react"
version := "7.19.0-7098e1"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "eslint" % "6.8-dt-20200406Z-514493",
  "org.scalablytyped.slinky" %%% "estree" % "0.0-unknown-dt-20200320Z-9738bf",
  "org.scalablytyped.slinky" %%% "json-schema" % "7.0-dt-20200225Z-45667d",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
