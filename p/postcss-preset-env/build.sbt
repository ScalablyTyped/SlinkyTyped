organization := "org.scalablytyped.slinky"
name := "postcss-preset-env"
version := "6.7-dt-20200830Z-681de0"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "autoprefixer" % "9.7-dt-20200515Z-79c411",
  "org.scalablytyped.slinky" %%% "browserslist" % "4.8-dt-20200515Z-037faf",
  "org.scalablytyped.slinky" %%% "postcss" % "7.0.35-f6dc1d",
  "org.scalablytyped.slinky" %%% "source-map" % "0.7.3-07892e",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
