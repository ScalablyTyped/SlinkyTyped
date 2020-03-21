organization := "org.scalablytyped.slinky"
name := "chromecast-caf-sender"
version := "1.0-dt-20200121Z-88a044"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "chrome" % "0.0-unknown-dt-20200228Z-a1bfef",
  "org.scalablytyped.slinky" %%% "filesystem" % "0.0-unknown-dt-20200225Z-d2ced6",
  "org.scalablytyped.slinky" %%% "filewriter" % "0.0-unknown-dt-20200226Z-7cfc8a",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
