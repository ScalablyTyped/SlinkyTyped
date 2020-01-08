organization := "org.scalablytyped.slinky"
name := "apollo__react-hoc"
version := "3.1.3-49d382"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "apollo-cache" % "1.3.4-1575f5",
  "org.scalablytyped.slinky" %%% "apollo-client" % "2.6.8-ee8034",
  "org.scalablytyped.slinky" %%% "apollo-link" % "1.2.13-c98446",
  "org.scalablytyped.slinky" %%% "apollo-utilities" % "1.3.2-63d30a",
  "org.scalablytyped.slinky" %%% "apollo__react-common" % "3.1.3-d9e950",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-f22bc8",
  "org.scalablytyped.slinky" %%% "graphql" % "14.5.8-ffbf48",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20190924Z-1d231d",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20191220Z-f02704",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43",
  "org.scalablytyped.slinky" %%% "zen-observable" % "0.8-dt-20180618Z-b2a3db",
  "org.scalablytyped.slinky" %%% "zen-observable-ts" % "0.8.20-28d607")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        