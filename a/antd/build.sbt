organization := "org.scalablytyped.slinky"
name := "antd"
version := "4.4.3-3bb24f"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "ant-design__react-slick" % "0.26.3-97963d",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-9fcfdc",
  "org.scalablytyped.slinky" %%% "dayjs" % "1.8.28-884040",
  "org.scalablytyped.slinky" %%% "moment" % "2.27.0-53fa1b",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-77dff4",
  "org.scalablytyped.slinky" %%% "rc-field-form" % "1.5.1-caaa82",
  "org.scalablytyped.slinky" %%% "rc-mentions" % "1.4.0-8535e8",
  "org.scalablytyped.slinky" %%% "rc-menu" % "8.5.0-7c2878",
  "org.scalablytyped.slinky" %%% "rc-notification" % "4.4.0-d5cef9",
  "org.scalablytyped.slinky" %%% "rc-picker" % "1.10.7-607cfd",
  "org.scalablytyped.slinky" %%% "rc-select" % "v5.9.0-dt-20200515Z-0e6e81",
  "org.scalablytyped.slinky" %%% "rc-table" % "7.8.6-080e21",
  "org.scalablytyped.slinky" %%% "rc-tree" % "1.11-dt-20200515Z-5dbdba",
  "org.scalablytyped.slinky" %%% "rc-tree-select" % "4.0.3-0b747e",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200711Z-014bc6",
  "org.scalablytyped.slinky" %%% "scroll-into-view-if-needed" % "2.2.22-65b1fa",
  "org.scalablytyped.slinky" %%% "std" % "3.9-25efe0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
