organization := "org.scalablytyped.slinky"
name := "phantomcss"
version := "0.11.1-dt-20200225Z-76ba4a"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "casperjs" % "1.1-dt-20200226Z-5878f4",
  "org.scalablytyped.slinky" %%% "phantomjs" % "1.9-dt-20200226Z-7c2331",
  "org.scalablytyped.slinky" %%% "resemblejs" % "v1.3.0-dt-20200227Z-60b27e",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
