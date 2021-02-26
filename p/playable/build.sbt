organization := "org.scalablytyped.slinky"
name := "playable"
version := "2.11.1-5640bc"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "chrome" % "0.0-unknown-dt-20201028Z-3b199e",
  "org.scalablytyped.slinky" %%% "chromecast-caf-sender" % "1.0-dt-20200121Z-1e1c60",
  "org.scalablytyped.slinky" %%% "eventemitter3" % "4.0.7-fa8348",
  "org.scalablytyped.slinky" %%% "filesystem" % "0.0-unknown-dt-20201002Z-77bfd9",
  "org.scalablytyped.slinky" %%% "filewriter" % "0.0-unknown-dt-20201002Z-7bd4d8",
  "org.scalablytyped.slinky" %%% "har-format" % "1.2-dt-20201030Z-2134bb",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
