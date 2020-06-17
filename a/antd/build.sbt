organization := "org.scalablytyped.slinky"
name := "antd"
version := "4.2.4-23705e"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "ant-design__react-slick" % "0.26.1-b09de0",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-046861",
  "org.scalablytyped.slinky" %%% "dayjs" % "1.8.27-307879",
  "org.scalablytyped.slinky" %%% "moment" % "2.26.0-860438",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-75109a",
  "org.scalablytyped.slinky" %%% "rc-field-form" % "1.2.4-2eb95b",
  "org.scalablytyped.slinky" %%% "rc-mentions" % "1.1.0-e0e1b0",
  "org.scalablytyped.slinky" %%% "rc-menu" % "8.1.0-671f18",
  "org.scalablytyped.slinky" %%% "rc-notification" % "4.3.2-245e67",
  "org.scalablytyped.slinky" %%% "rc-picker" % "1.4.16-e7f47d",
  "org.scalablytyped.slinky" %%% "rc-select" % "v5.9.0-dt-20200515Z-2a4bbc",
  "org.scalablytyped.slinky" %%% "rc-table" % "7.5.9-3bb463",
  "org.scalablytyped.slinky" %%% "rc-tree" % "1.11-dt-20200515Z-97bd73",
  "org.scalablytyped.slinky" %%% "rc-tree-select" % "3.1.3-8031d5",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200515Z-5e5e25",
  "org.scalablytyped.slinky" %%% "scroll-into-view-if-needed" % "2.2.22-ed6c71",
  "org.scalablytyped.slinky" %%% "std" % "3.9-a77a62")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
