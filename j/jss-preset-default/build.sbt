organization := "org.scalablytyped.slinky"
name := "jss-preset-default"
version := "10.1.1-1af1c6"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-e9335f",
  "org.scalablytyped.slinky" %%% "jss" % "10.1.1-cda842",
  "org.scalablytyped.slinky" %%% "jss-plugin-default-unit" % "10.0.4-b04291",
  "org.scalablytyped.slinky" %%% "jss-plugin-rule-value-observable" % "10.1.1-48538f",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
