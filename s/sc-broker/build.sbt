organization := "org.scalablytyped.slinky"
name := "sc-broker"
version := "8.0-dt-20200519Z-c393fb"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "expirymanager" % "0.9-dt-20181130Z-e43835",
  "org.scalablytyped.slinky" %%% "fleximap" % "0.9-dt-20181205Z-c9504c",
  "org.scalablytyped.slinky" %%% "ncom" % "1.0-dt-20200205Z-1bb2e7",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-f152d9",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
