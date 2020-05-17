organization := "org.scalablytyped.slinky"
name := "react-mosaic-component"
version := "3.2.0-69058e"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "blueprintjs__core" % "3.24.0-fc88f0",
  "org.scalablytyped.slinky" %%% "blueprintjs__icons" % "3.14.0-ed37e8",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-e9335f",
  "org.scalablytyped.slinky" %%% "dnd-core" % "9.5.1-049dd4",
  "org.scalablytyped.slinky" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-54b080",
  "org.scalablytyped.slinky" %%% "immutability-helper" % "3.0.1-f6ff45",
  "org.scalablytyped.slinky" %%% "popper_dot_js" % "1.16.1-3648d2",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20190924Z-7e1d98",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200409Z-36b705",
  "org.scalablytyped.slinky" %%% "react-dnd" % "9.5.1-091a86",
  "org.scalablytyped.slinky" %%% "react-popper" % "1.3.7-a0bb08",
  "org.scalablytyped.slinky" %%% "redux" % "4.0.5-d1b67b",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
