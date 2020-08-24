organization := "org.scalablytyped.slinky"
name := "graphql-tools__git-loader"
version := "6.0.15-074af5"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "babel__parser" % "7.11.0-267e63",
  "org.scalablytyped.slinky" %%% "babel__types" % "7.11.0-e8c905",
  "org.scalablytyped.slinky" %%% "graphql" % "15.3.0-079e56",
  "org.scalablytyped.slinky" %%% "graphql-tools__graphql-tag-pluck" % "6.0.15-7f4150",
  "org.scalablytyped.slinky" %%% "graphql-tools__utils" % "6.0.15-531dfc",
  "org.scalablytyped.slinky" %%% "std" % "3.9-88d6d8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
