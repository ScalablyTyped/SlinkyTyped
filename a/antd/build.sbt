organization := "org.scalablytyped.slinky"
name := "antd"
version := "4.8.5-d1d30d"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "ant-design__icons" % "4.3.0-ae520a",
  "org.scalablytyped.slinky" %%% "ant-design__icons-svg" % "4.1.0-f15113",
  "org.scalablytyped.slinky" %%% "ant-design__react-slick" % "0.27.14-7487d7",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.14-58bcb0",
  "org.scalablytyped.slinky" %%% "dayjs" % "1.9.6-654bc1",
  "org.scalablytyped.slinky" %%% "moment" % "2.29.1-f4e266",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-931d77",
  "org.scalablytyped.slinky" %%% "rc-dialog" % "8.4.3-9ed61c",
  "org.scalablytyped.slinky" %%% "rc-field-form" % "1.17.2-4a4200",
  "org.scalablytyped.slinky" %%% "rc-image" % "4.0.1-c69ad7",
  "org.scalablytyped.slinky" %%% "rc-mentions" % "1.5.2-5462b8",
  "org.scalablytyped.slinky" %%% "rc-menu" % "8.10.0-84ac2e",
  "org.scalablytyped.slinky" %%% "rc-motion" % "2.4.1-279866",
  "org.scalablytyped.slinky" %%% "rc-notification" % "4.5.4-e5c0fa",
  "org.scalablytyped.slinky" %%% "rc-picker" % "2.4.1-681ed9",
  "org.scalablytyped.slinky" %%% "rc-select" % "11.4.2-00587d",
  "org.scalablytyped.slinky" %%% "rc-table" % "7.11.2-459414",
  "org.scalablytyped.slinky" %%% "rc-tabs" % "11.7.1-089b6b",
  "org.scalablytyped.slinky" %%% "rc-textarea" % "0.3.1-2f6277",
  "org.scalablytyped.slinky" %%% "rc-tooltip" % "5.0.1-c3921f",
  "org.scalablytyped.slinky" %%% "rc-tree" % "3.11.0-4fd2a5",
  "org.scalablytyped.slinky" %%% "rc-tree-select" % "4.1.3-b60da0",
  "org.scalablytyped.slinky" %%% "rc-trigger" % "5.1.2-d33cb4",
  "org.scalablytyped.slinky" %%% "rc-util" % "5.5.0-63a1aa",
  "org.scalablytyped.slinky" %%% "react" % "17.0-dt-20201121Z-9cde70",
  "org.scalablytyped.slinky" %%% "scroll-into-view-if-needed" % "2.2.26-816370",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
