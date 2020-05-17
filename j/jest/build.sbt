organization := "org.scalablytyped.slinky"
name := "jest"
version := "25.2-dt-20200416Z-77f86b"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "chalk" % "2.4.2-b5200d",
  "org.scalablytyped.slinky" %%% "jest-diff" % "24.9.0-9e34c6",
  "org.scalablytyped.slinky" %%% "pretty-format" % "24.9.0-e411e6",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
