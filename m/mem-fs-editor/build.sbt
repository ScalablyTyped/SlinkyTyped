organization := "org.scalablytyped.slinky"
name := "mem-fs-editor"
version := "7.0-dt-20200707Z-28ed22"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "ejs" % "3.0-dt-20200515Z-0f2e3c",
  "org.scalablytyped.slinky" %%% "glob" % "7.1-dt-20200706Z-38c139",
  "org.scalablytyped.slinky" %%% "json-schema" % "7.0-dt-20200609Z-d26060",
  "org.scalablytyped.slinky" %%% "mem-fs" % "1.1-dt-20181203Z-06d7ae",
  "org.scalablytyped.slinky" %%% "minimatch" % "3.0-dt-20200515Z-5c4d1c",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-8c2fed",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf",
  "org.scalablytyped.slinky" %%% "vinyl" % "2.0-dt-20200515Z-59ddcc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
