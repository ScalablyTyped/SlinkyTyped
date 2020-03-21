organization := "org.scalablytyped.slinky"
name := "sc-broker"
version := "8.0-dt-20200205Z-24aa3b"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "expirymanager" % "0.9-dt-20181130Z-157dc9",
  "org.scalablytyped.slinky" %%% "fleximap" % "0.9-dt-20181205Z-8d93c2",
  "org.scalablytyped.slinky" %%% "ncom" % "1.0-dt-20200205Z-561749",
  "org.scalablytyped.slinky" %%% "node" % "13.7-dt-20200228Z-eb4e34",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
