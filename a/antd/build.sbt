organization := "org.scalablytyped.slinky"
name := "antd"
version := "4.3.4-6a2cce"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "ant-design__react-slick" % "0.26.2-1647c8",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-57a4b7",
  "org.scalablytyped.slinky" %%% "dayjs" % "1.8.28-733ef1",
  "org.scalablytyped.slinky" %%% "moment" % "2.26.0-c1028f",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-151476",
  "org.scalablytyped.slinky" %%% "rc-field-form" % "1.4.4-b8cd40",
  "org.scalablytyped.slinky" %%% "rc-mentions" % "1.2.0-ab88ef",
  "org.scalablytyped.slinky" %%% "rc-menu" % "8.3.1-292113",
  "org.scalablytyped.slinky" %%% "rc-notification" % "4.4.0-c10a59",
  "org.scalablytyped.slinky" %%% "rc-picker" % "1.6.4-e19057",
  "org.scalablytyped.slinky" %%% "rc-select" % "v5.9.0-dt-20200515Z-3f71b3",
  "org.scalablytyped.slinky" %%% "rc-table" % "7.8.0-2317d3",
  "org.scalablytyped.slinky" %%% "rc-tree" % "1.11-dt-20200515Z-8972bb",
  "org.scalablytyped.slinky" %%% "rc-tree-select" % "4.0.1-296632",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200617Z-5b2e1b",
  "org.scalablytyped.slinky" %%% "scroll-into-view-if-needed" % "2.2.22-a8bfad",
  "org.scalablytyped.slinky" %%% "std" % "3.9-18eec6")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
