organization := "org.scalablytyped.slinky"
name := "gulp-help"
version := "0.0-unknown-dt-20200515Z-df77b9"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "chokidar" % "3.4.1-cc0bda",
  "org.scalablytyped.slinky" %%% "glob" % "7.1-dt-20200706Z-38c139",
  "org.scalablytyped.slinky" %%% "glob-stream" % "v6.1.0-dt-20200515Z-58b35f",
  "org.scalablytyped.slinky" %%% "gulp" % "4.0-dt-20200515Z-98af1d",
  "org.scalablytyped.slinky" %%% "minimatch" % "3.0-dt-20200515Z-5c4d1c",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-8c2fed",
  "org.scalablytyped.slinky" %%% "orchestrator" % "0.3-dt-20200515Z-c726bc",
  "org.scalablytyped.slinky" %%% "q" % "1.5-dt-20200515Z-fdd177",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf",
  "org.scalablytyped.slinky" %%% "undertaker" % "1.2-dt-20200515Z-5e0484",
  "org.scalablytyped.slinky" %%% "undertaker-registry" % "1.0-dt-20200515Z-87d69a",
  "org.scalablytyped.slinky" %%% "vinyl" % "2.0-dt-20200515Z-59ddcc",
  "org.scalablytyped.slinky" %%% "vinyl-fs" % "2.4-dt-20200515Z-e7af6f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
