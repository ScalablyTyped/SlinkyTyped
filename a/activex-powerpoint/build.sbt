organization := "org.scalablytyped.slinky"
name := "activex-powerpoint"
version := "14.0-dt-20201028Z-788bcc"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "activex-office" % "16.0-dt-20201028Z-c9f2a3",
  "org.scalablytyped.slinky" %%% "activex-outlook" % "14.0-dt-20200515Z-164c49",
  "org.scalablytyped.slinky" %%% "activex-stdole" % "2.0-dt-20200515Z-fe05ba",
  "org.scalablytyped.slinky" %%% "activex-vbide" % "14.0-dt-20200515Z-d04386",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
