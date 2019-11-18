organization := "org.scalablytyped.slinky"
name := "material-ui__core"
version := "3.9.3-51e67a"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-834b48",
  "org.scalablytyped.slinky" %%% "jss" % "10.0.0-52d2c0",
  "org.scalablytyped.slinky" %%% "popper_dot_js" % "1.16.0-691c2e",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20190924Z-242933",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20191025Z-b3a7f8",
  "org.scalablytyped.slinky" %%% "react-transition-group" % "4.2-dt-20191002Z-9d9583",
  "org.scalablytyped.slinky" %%% "std" % "3.7-41c436")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        