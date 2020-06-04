organization := "org.scalablytyped.slinky"
name := "antd"
version := "4.2.4-2f1875"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "ant-design__react-slick" % "0.26.1-05eba3",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-d1c111",
  "org.scalablytyped.slinky" %%% "dayjs" % "1.8.27-782ba3",
  "org.scalablytyped.slinky" %%% "moment" % "2.26.0-4d2bc3",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-7481b3",
  "org.scalablytyped.slinky" %%% "rc-field-form" % "1.2.4-0acd7c",
  "org.scalablytyped.slinky" %%% "rc-mentions" % "1.1.0-15dbcd",
  "org.scalablytyped.slinky" %%% "rc-menu" % "8.1.0-7d2587",
  "org.scalablytyped.slinky" %%% "rc-notification" % "4.3.2-0c2b9e",
  "org.scalablytyped.slinky" %%% "rc-picker" % "1.4.16-1aba0f",
  "org.scalablytyped.slinky" %%% "rc-select" % "v5.9.0-dt-20200515Z-46d836",
  "org.scalablytyped.slinky" %%% "rc-table" % "7.5.9-6051e3",
  "org.scalablytyped.slinky" %%% "rc-tree" % "1.11-dt-20200515Z-1d0c43",
  "org.scalablytyped.slinky" %%% "rc-tree-select" % "3.1.3-54698e",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200515Z-83112e",
  "org.scalablytyped.slinky" %%% "scroll-into-view-if-needed" % "2.2.22-cc90c5",
  "org.scalablytyped.slinky" %%% "std" % "3.9-ad7699")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
