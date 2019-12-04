organization := "org.scalablytyped.slinky"
name := "antd"
version := "3.25.3-73f2cb"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "ant-design__create-react-context" % "0.2.4-6ee586",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-34c756",
  "org.scalablytyped.slinky" %%% "moment" % "2.24.0-b0f930",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20190924Z-243f84",
  "org.scalablytyped.slinky" %%% "rc-mentions" % "0.4.1-fe51c4",
  "org.scalablytyped.slinky" %%% "rc-menu" % "7.5.3-884453",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20191126Z-26f45e",
  "org.scalablytyped.slinky" %%% "react-slick" % "0.23-dt-20190503Z-501113",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        