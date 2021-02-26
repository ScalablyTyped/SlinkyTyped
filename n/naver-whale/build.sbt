organization := "org.scalablytyped.slinky"
name := "naver-whale"
version := "0.0-unknown-dt-20201002Z-c151d7"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "chrome" % "0.0-unknown-dt-20201028Z-3b199e",
  "org.scalablytyped.slinky" %%% "filesystem" % "0.0-unknown-dt-20201002Z-77bfd9",
  "org.scalablytyped.slinky" %%% "filewriter" % "0.0-unknown-dt-20201002Z-7bd4d8",
  "org.scalablytyped.slinky" %%% "har-format" % "1.2-dt-20201030Z-2134bb",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
