organization := "org.scalablytyped.slinky"
name := "gulp-htmlmin"
version := "v1.3.0-dt-20200515Z-5a2774"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "clean-css" % "4.2-dt-20200612Z-c7d675",
  "org.scalablytyped.slinky" %%% "html-minifier" % "4.0-dt-20200621Z-45dc68",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-8c2fed",
  "org.scalablytyped.slinky" %%% "relateurl" % "v0.2.6-dt-20200515Z-c80b72",
  "org.scalablytyped.slinky" %%% "source-map" % "0.7.3-92df5a",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf",
  "org.scalablytyped.slinky" %%% "uglify-js" % "3.9-dt-20200706Z-001eb3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
