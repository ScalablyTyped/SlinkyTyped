organization := "org.scalablytyped.slinky"
name := "cpy"
version := "8.1.0-8a46ef"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "fast-glob" % "3.2.4-df6e9c",
  "org.scalablytyped.slinky" %%% "globby" % "11.0.1-becc6c",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-8c2fed",
  "org.scalablytyped.slinky" %%% "nodelib__fs_dot_scandir" % "2.1.3-22b3f9",
  "org.scalablytyped.slinky" %%% "nodelib__fs_dot_stat" % "2.0.3-4e891a",
  "org.scalablytyped.slinky" %%% "nodelib__fs_dot_walk" % "1.2.4-150c3f",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
