organization := "org.scalablytyped.slinky"
name := "activex-excel"
version := "14.0-dt-20201028Z-e2636f"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "activex-adodb" % "6.1-dt-20200515Z-6e0360",
  "org.scalablytyped.slinky" %%% "activex-dao" % "16.0-dt-20201028Z-1bcdbe",
  "org.scalablytyped.slinky" %%% "activex-office" % "16.0-dt-20201028Z-627d8a",
  "org.scalablytyped.slinky" %%% "activex-outlook" % "14.0-dt-20200515Z-1a30dd",
  "org.scalablytyped.slinky" %%% "activex-stdole" % "2.0-dt-20200515Z-5275b0",
  "org.scalablytyped.slinky" %%% "activex-vbide" % "14.0-dt-20200515Z-988b1e",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
