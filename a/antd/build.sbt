organization := "org.scalablytyped.slinky"
name := "antd"
version := "4.8.4-3e371f"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "ant-design__icons" % "4.3.0-0f2274",
  "org.scalablytyped.slinky" %%% "ant-design__icons-svg" % "4.1.0-d321c8",
  "org.scalablytyped.slinky" %%% "ant-design__react-slick" % "0.27.14-c6f035",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.14-23cf0c",
  "org.scalablytyped.slinky" %%% "dayjs" % "1.9.6-25a13e",
  "org.scalablytyped.slinky" %%% "moment" % "2.29.1-4471dc",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-ed7fbd",
  "org.scalablytyped.slinky" %%% "rc-dialog" % "8.4.3-5bc243",
  "org.scalablytyped.slinky" %%% "rc-field-form" % "1.15.1-b11570",
  "org.scalablytyped.slinky" %%% "rc-image" % "4.0.1-832d81",
  "org.scalablytyped.slinky" %%% "rc-mentions" % "1.5.2-f5f48d",
  "org.scalablytyped.slinky" %%% "rc-menu" % "8.10.0-0e83bc",
  "org.scalablytyped.slinky" %%% "rc-motion" % "2.3.4-af6217",
  "org.scalablytyped.slinky" %%% "rc-notification" % "4.5.4-f86784",
  "org.scalablytyped.slinky" %%% "rc-picker" % "2.3.4-863331",
  "org.scalablytyped.slinky" %%% "rc-select" % "11.4.2-e437fc",
  "org.scalablytyped.slinky" %%% "rc-table" % "7.11.2-e7ac6d",
  "org.scalablytyped.slinky" %%% "rc-tabs" % "11.7.1-73940d",
  "org.scalablytyped.slinky" %%% "rc-textarea" % "0.3.1-03eae7",
  "org.scalablytyped.slinky" %%% "rc-tooltip" % "5.0.1-35b8bf",
  "org.scalablytyped.slinky" %%% "rc-tree" % "3.11.0-ad9227",
  "org.scalablytyped.slinky" %%% "rc-tree-select" % "4.1.3-8501c1",
  "org.scalablytyped.slinky" %%% "rc-trigger" % "5.1.2-958e32",
  "org.scalablytyped.slinky" %%% "rc-util" % "5.5.0-e60eda",
  "org.scalablytyped.slinky" %%% "react" % "17.0-dt-20201121Z-8f0b52",
  "org.scalablytyped.slinky" %%% "scroll-into-view-if-needed" % "2.2.26-b268ff",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
