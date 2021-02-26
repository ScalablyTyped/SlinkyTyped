organization := "org.scalablytyped.slinky"
name := "react-sortable-tree-theme-file-explorer"
version := "0.0-dt-20200914Z-ec0b21"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.14-58bcb0",
  "org.scalablytyped.slinky" %%% "dnd-core" % "11.1.3-1dc077",
  "org.scalablytyped.slinky" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-d5f05b",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-931d77",
  "org.scalablytyped.slinky" %%% "react" % "17.0-dt-20201121Z-9cde70",
  "org.scalablytyped.slinky" %%% "react-dnd" % "11.1.3-bf6acc",
  "org.scalablytyped.slinky" %%% "react-sortable-tree" % "0.3-dt-20200717Z-35b340",
  "org.scalablytyped.slinky" %%% "react-virtualized" % "9.21-dt-20201002Z-8211c8",
  "org.scalablytyped.slinky" %%% "redux" % "4.0.5-9bd9e7",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
