organization := "org.scalablytyped.slinky"
name := "rollup-plugin-postcss"
version := "2.0-dt-20200830Z-08595f"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "cssnano" % "4.0-dt-20180802Z-42f526",
  "org.scalablytyped.slinky" %%% "postcss" % "7.0.35-2be29d",
  "org.scalablytyped.slinky" %%% "rollup" % "2.33.3-4f9172",
  "org.scalablytyped.slinky" %%% "source-map" % "0.7.3-09416f",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
