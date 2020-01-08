organization := "org.scalablytyped.slinky"
name := "mongoose-auto-increment"
version := "5.0.1-dt-20191003Z-acb46a"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "bson" % "4.0-dt-20191119Z-5586f3",
  "org.scalablytyped.slinky" %%% "mongodb" % "3.3-dt-20191223Z-36c89f",
  "org.scalablytyped.slinky" %%% "mongoose" % "5.5.1-dt-20200102Z-b673c9",
  "org.scalablytyped.slinky" %%% "node" % "13.1-dt-20200103Z-c18ea7",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        