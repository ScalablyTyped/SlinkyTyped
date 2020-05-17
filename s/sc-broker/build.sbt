organization := "org.scalablytyped.slinky"
name := "sc-broker"
version := "8.0-dt-20200205Z-11d4b5"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "expirymanager" % "0.9-dt-20181130Z-c45d13",
  "org.scalablytyped.slinky" %%% "fleximap" % "0.9-dt-20181205Z-8b4eaa",
  "org.scalablytyped.slinky" %%% "ncom" % "1.0-dt-20200205Z-586b20",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-9e8213",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
