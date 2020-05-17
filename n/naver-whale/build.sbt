organization := "org.scalablytyped.slinky"
name := "naver-whale"
version := "0.0-unknown-dt-20200310Z-8377b2"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "chrome" % "0.0-unknown-dt-20200426Z-822041",
  "org.scalablytyped.slinky" %%% "filesystem" % "0.0-unknown-dt-20200225Z-87a56d",
  "org.scalablytyped.slinky" %%% "filewriter" % "0.0-unknown-dt-20200226Z-cecf99",
  "org.scalablytyped.slinky" %%% "har-format" % "1.2-dt-20190213Z-4e822f",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
