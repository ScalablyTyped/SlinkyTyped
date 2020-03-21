organization := "org.scalablytyped.slinky"
name := "react-sortable-tree-theme-file-explorer"
version := "0.0-dt-20190717Z-87f2b2"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-89abae",
  "org.scalablytyped.slinky" %%% "dnd-core" % "9.5.1-4453f9",
  "org.scalablytyped.slinky" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-0fa30c",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20190924Z-6bb503",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200227Z-f18fda",
  "org.scalablytyped.slinky" %%% "react-dnd" % "9.5.1-b36757",
  "org.scalablytyped.slinky" %%% "react-sortable-tree" % "0.3-dt-20191024Z-2f7697",
  "org.scalablytyped.slinky" %%% "react-virtualized" % "9.21-dt-20200225Z-190cc6",
  "org.scalablytyped.slinky" %%% "redux" % "4.0.5-9d78fe",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
