organization := "org.scalablytyped.slinky"
name := "antd"
version := "4.2.4-7b812f"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "ant-design__react-slick" % "0.26.1-9e7963",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-6e65be",
  "org.scalablytyped.slinky" %%% "dayjs" % "1.8.27-1def79",
  "org.scalablytyped.slinky" %%% "moment" % "2.26.0-72acea",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20200515Z-ecc9ab",
  "org.scalablytyped.slinky" %%% "rc-field-form" % "1.2.4-b57ea5",
  "org.scalablytyped.slinky" %%% "rc-mentions" % "1.1.0-bf30a4",
  "org.scalablytyped.slinky" %%% "rc-menu" % "8.1.0-e1834d",
  "org.scalablytyped.slinky" %%% "rc-notification" % "4.3.2-1f7b61",
  "org.scalablytyped.slinky" %%% "rc-picker" % "1.4.16-2214b9",
  "org.scalablytyped.slinky" %%% "rc-select" % "v5.9.0-dt-20200515Z-544787",
  "org.scalablytyped.slinky" %%% "rc-table" % "7.5.9-02ec98",
  "org.scalablytyped.slinky" %%% "rc-tree" % "1.11-dt-20200515Z-fc82f3",
  "org.scalablytyped.slinky" %%% "rc-tree-select" % "3.1.3-08e0a6",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200515Z-5c4f6b",
  "org.scalablytyped.slinky" %%% "scroll-into-view-if-needed" % "2.2.22-579e1f",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
