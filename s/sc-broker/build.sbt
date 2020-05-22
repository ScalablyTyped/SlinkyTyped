organization := "org.scalablytyped.slinky"
name := "sc-broker"
version := "8.0-dt-20200519Z-1c078e"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "expirymanager" % "0.9-dt-20181130Z-871e30",
  "org.scalablytyped.slinky" %%% "fleximap" % "0.9-dt-20181205Z-2eb0fa",
  "org.scalablytyped.slinky" %%% "ncom" % "1.0-dt-20200205Z-706418",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200519Z-fa178d",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
