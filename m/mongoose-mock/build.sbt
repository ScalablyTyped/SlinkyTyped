organization := "org.scalablytyped.slinky"
name := "mongoose-mock"
version := "0.4.0-dt-20200424Z-4b5ae6"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "bson" % "4.0-dt-20200319Z-cb58b3",
  "org.scalablytyped.slinky" %%% "mongodb" % "3.5-dt-20200426Z-daa38b",
  "org.scalablytyped.slinky" %%% "mongoose" % "5.7.13-dt-20200426Z-69d167",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-9e8213",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
