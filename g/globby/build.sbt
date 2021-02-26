organization := "org.scalablytyped.slinky"
name := "globby"
version := "11.0.1-258e70"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "fast-glob" % "3.2.4-afedec",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-f152d9",
  "org.scalablytyped.slinky" %%% "nodelib__fs_dot_scandir" % "2.1.3-9e9662",
  "org.scalablytyped.slinky" %%% "nodelib__fs_dot_stat" % "2.0.3-a9ca4e",
  "org.scalablytyped.slinky" %%% "nodelib__fs_dot_walk" % "1.2.4-bec17b",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
