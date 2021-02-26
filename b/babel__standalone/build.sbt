organization := "org.scalablytyped.slinky"
name := "babel__standalone"
version := "7.1-dt-20200924Z-8db343"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "babel__core" % "7.1-dt-20201102Z-02b271",
  "org.scalablytyped.slinky" %%% "babel__generator" % "7.6-dt-20200925Z-22ab51",
  "org.scalablytyped.slinky" %%% "babel__parser" % "7.12.7-44f313",
  "org.scalablytyped.slinky" %%% "babel__template" % "7.4-dt-20201112Z-37f38a",
  "org.scalablytyped.slinky" %%% "babel__traverse" % "7.0-dt-20200925Z-701857",
  "org.scalablytyped.slinky" %%% "babel__types" % "7.12.7-ade8b2",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
