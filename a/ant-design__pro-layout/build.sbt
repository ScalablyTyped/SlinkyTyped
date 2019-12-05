organization := "org.scalablytyped.slinky"
name := "ant-design__pro-layout"
version := "4.8.3-1871cc"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "ant-design__create-react-context" % "0.2.4-306f31",
  "org.scalablytyped.slinky" %%% "antd" % "3.25.3-3ec082",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-34c756",
  "org.scalablytyped.slinky" %%% "history" % "4.7.2-dt-20191126Z-44cadc",
  "org.scalablytyped.slinky" %%% "lodash" % "4.14-dt-20191126Z-7d8796",
  "org.scalablytyped.slinky" %%% "moment" % "2.24.0-b0f930",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20190924Z-243f84",
  "org.scalablytyped.slinky" %%% "rc-mentions" % "0.4.1-7105da",
  "org.scalablytyped.slinky" %%% "rc-menu" % "7.5.3-be2615",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20191126Z-6c3558",
  "org.scalablytyped.slinky" %%% "react-router" % "5.1-dt-20191126Z-e98a2d",
  "org.scalablytyped.slinky" %%% "react-slick" % "0.23-dt-20190503Z-e21113",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        