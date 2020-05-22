organization := "org.scalablytyped.slinky"
name := "naver-whale"
version := "0.0-unknown-dt-20200515Z-b93a72"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "chrome" % "0.0-unknown-dt-20200519Z-02c87e",
  "org.scalablytyped.slinky" %%% "filesystem" % "0.0-unknown-dt-20200515Z-79915e",
  "org.scalablytyped.slinky" %%% "filewriter" % "0.0-unknown-dt-20200515Z-76312a",
  "org.scalablytyped.slinky" %%% "har-format" % "1.2-dt-20200515Z-dfa94d",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
