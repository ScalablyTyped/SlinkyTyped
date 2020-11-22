organization := "org.scalablytyped.slinky"
name := "naver-whale"
version := "0.0-unknown-dt-20201002Z-2327e7"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "chrome" % "0.0-unknown-dt-20201028Z-00a5c1",
  "org.scalablytyped.slinky" %%% "filesystem" % "0.0-unknown-dt-20201002Z-6e02c8",
  "org.scalablytyped.slinky" %%% "filewriter" % "0.0-unknown-dt-20201002Z-d399f2",
  "org.scalablytyped.slinky" %%% "har-format" % "1.2-dt-20201030Z-5a6e76",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
