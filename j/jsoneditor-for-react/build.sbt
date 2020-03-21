organization := "org.scalablytyped.slinky"
name := "jsoneditor-for-react"
version := "0.0-dt-20200225Z-818f18"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "ace" % "0.0-unknown-dt-20200225Z-875db9",
  "org.scalablytyped.slinky" %%% "ajv" % "6.11.0-7a0f9a",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-89abae",
  "org.scalablytyped.slinky" %%% "jsoneditor" % "v5.28.2-dt-20200225Z-1e7a4c",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20190924Z-6bb503",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200227Z-f18fda",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
