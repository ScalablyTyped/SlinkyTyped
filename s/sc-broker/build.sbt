organization := "org.scalablytyped.slinky"
name := "sc-broker"
version := "8.0-dt-20200519Z-cf2285"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "expirymanager" % "0.9-dt-20181130Z-ffe414",
  "org.scalablytyped.slinky" %%% "fleximap" % "0.9-dt-20181205Z-ce6eef",
  "org.scalablytyped.slinky" %%% "ncom" % "1.0-dt-20200205Z-0ef4b6",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-8c2fed",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
