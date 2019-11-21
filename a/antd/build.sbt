organization := "org.scalablytyped.slinky"
name := "antd"
version := "3.25.1-f3a0ed"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "ant-design__create-react-context" % "0.2.4-41bc19",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-7d274f",
  "org.scalablytyped.slinky" %%% "moment" % "2.24.0-a82e98",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20190924Z-1735fa",
  "org.scalablytyped.slinky" %%% "rc-mentions" % "0.4.1-30f373",
  "org.scalablytyped.slinky" %%% "rc-menu" % "7.5.3-94b77f",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20191025Z-852e77",
  "org.scalablytyped.slinky" %%% "react-slick" % "0.23-dt-20190503Z-731e26",
  "org.scalablytyped.slinky" %%% "std" % "3.7-5d968d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        