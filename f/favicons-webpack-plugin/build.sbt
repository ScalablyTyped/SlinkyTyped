organization := "org.scalablytyped.slinky"
name := "favicons-webpack-plugin"
version := "1.0-dt-20191001Z-8a62b0"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "favicons" % "5.5-dt-20200226Z-7ed50c",
  "org.scalablytyped.slinky" %%% "html-minifier-terser" % "5.1-dt-20200504Z-220ddb",
  "org.scalablytyped.slinky" %%% "html-webpack-plugin" % "4.3.0-d6ab44",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-df8c17",
  "org.scalablytyped.slinky" %%% "std" % "3.9-88d6d8",
  "org.scalablytyped.slinky" %%% "tapable" % "v1.0.0-dt-20200616Z-40ebd8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
