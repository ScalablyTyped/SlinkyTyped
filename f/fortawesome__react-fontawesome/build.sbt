organization := "org.scalablytyped.slinky"
name := "fortawesome__react-fontawesome"
version := "0.1.7-b77f42"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-834b48",
  "org.scalablytyped.slinky" %%% "fortawesome__fontawesome-common-types" % "0.2.25-775de6",
  "org.scalablytyped.slinky" %%% "fortawesome__fontawesome-svg-core" % "1.2.25-d1aa30",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20190924Z-242933",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20191025Z-b3a7f8",
  "org.scalablytyped.slinky" %%% "std" % "3.7-41c436")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        