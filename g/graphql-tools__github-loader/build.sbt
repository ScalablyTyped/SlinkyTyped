organization := "org.scalablytyped.slinky"
name := "graphql-tools__github-loader"
version := "6.0.15-6dfc65"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "babel__parser" % "7.11.0-90e98e",
  "org.scalablytyped.slinky" %%% "babel__types" % "7.11.0-e30392",
  "org.scalablytyped.slinky" %%% "graphql" % "15.3.0-09ebdf",
  "org.scalablytyped.slinky" %%% "graphql-tools__graphql-tag-pluck" % "6.0.15-552d75",
  "org.scalablytyped.slinky" %%% "graphql-tools__utils" % "6.0.15-219b96",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
