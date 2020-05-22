organization := "org.scalablytyped.slinky"
name := "react-sortable-tree-theme-file-explorer"
version := "0.0-dt-20200515Z-582b5d"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-6e65be",
  "org.scalablytyped.slinky" %%% "dnd-core" % "9.5.1-73b743",
  "org.scalablytyped.slinky" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-272fb7",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-ecc9ab",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200515Z-b103c7",
  "org.scalablytyped.slinky" %%% "react-dnd" % "9.5.1-ba4c35",
  "org.scalablytyped.slinky" %%% "react-sortable-tree" % "0.3-dt-20200515Z-b7f1e3",
  "org.scalablytyped.slinky" %%% "react-virtualized" % "9.21-dt-20200515Z-e73fc3",
  "org.scalablytyped.slinky" %%% "redux" % "4.0.5-7392f6",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
