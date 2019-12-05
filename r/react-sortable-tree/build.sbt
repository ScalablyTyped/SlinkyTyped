organization := "org.scalablytyped.slinky"
name := "react-sortable-tree"
version := "0.3-dt-20191024Z-a0ed6e"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-34c756",
  "org.scalablytyped.slinky" %%% "dnd-core" % "9.5.1-a0860d",
  "org.scalablytyped.slinky" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-549e65",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20190924Z-243f84",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20191126Z-6c3558",
  "org.scalablytyped.slinky" %%% "react-dnd" % "9.5.1-346c7c",
  "org.scalablytyped.slinky" %%% "react-virtualized" % "9.21-dt-20191126Z-879649",
  "org.scalablytyped.slinky" %%% "redux" % "4.0.4-1fd55d",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        