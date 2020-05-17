organization := "org.scalablytyped.slinky"
name := "gulp-help-doc"
version := "0.0-unknown-dt-20200226Z-5a64c3"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "chokidar" % "3.3.1-c4152c",
  "org.scalablytyped.slinky" %%% "glob" % "7.1-dt-20200226Z-b875fa",
  "org.scalablytyped.slinky" %%% "glob-stream" % "v6.1.0-dt-20200226Z-40ee44",
  "org.scalablytyped.slinky" %%% "gulp" % "4.0-dt-20200225Z-83ee8d",
  "org.scalablytyped.slinky" %%% "minimatch" % "3.0-dt-20200226Z-c4f6f9",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-9e8213",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb",
  "org.scalablytyped.slinky" %%% "undertaker" % "1.2-dt-20200225Z-d1f8f2",
  "org.scalablytyped.slinky" %%% "undertaker-registry" % "1.0-dt-20200225Z-ef4e18",
  "org.scalablytyped.slinky" %%% "vinyl" % "2.0-dt-20200225Z-ee4bf0",
  "org.scalablytyped.slinky" %%% "vinyl-fs" % "2.4-dt-20200227Z-97b6f2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
