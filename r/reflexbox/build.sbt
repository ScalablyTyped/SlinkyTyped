organization := "org.scalablytyped.slinky"
name := "reflexbox"
version := "4.0-dt-20191126Z-10100c"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-34c756",
  "org.scalablytyped.slinky" %%% "emotion__serialize" % "0.11.11-213c24",
  "org.scalablytyped.slinky" %%% "emotion__styled-base" % "10.0.24-6d5370",
  "org.scalablytyped.slinky" %%% "emotion__utils" % "0.11.2-7e2d6a",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20190924Z-243f84",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20191126Z-6c3558",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821",
  "org.scalablytyped.slinky" %%% "styled-system" % "5.1-dt-20191118Z-0882e8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        