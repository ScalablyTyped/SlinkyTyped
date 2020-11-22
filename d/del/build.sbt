organization := "org.scalablytyped.slinky"
name := "del"
version := "6.0.0-c4a3b2"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "fast-glob" % "3.2.4-ce41ca",
  "org.scalablytyped.slinky" %%% "globby" % "11.0.1-915c3b",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-b1b1c0",
  "org.scalablytyped.slinky" %%% "nodelib__fs_dot_scandir" % "2.1.3-b7f434",
  "org.scalablytyped.slinky" %%% "nodelib__fs_dot_stat" % "2.0.3-f14149",
  "org.scalablytyped.slinky" %%% "nodelib__fs_dot_walk" % "1.2.4-4a805c",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
