organization := "org.scalablytyped.slinky"
name := "del"
version := "5.1.0-7bb8e0"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "fast-glob" % "3.2.4-48ef1f",
  "org.scalablytyped.slinky" %%% "globby" % "11.0.1-378e3a",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-df8c17",
  "org.scalablytyped.slinky" %%% "nodelib__fs_dot_scandir" % "2.1.3-bcbf4b",
  "org.scalablytyped.slinky" %%% "nodelib__fs_dot_stat" % "2.0.3-a7874d",
  "org.scalablytyped.slinky" %%% "nodelib__fs_dot_walk" % "1.2.4-08b3da",
  "org.scalablytyped.slinky" %%% "std" % "3.9-88d6d8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
