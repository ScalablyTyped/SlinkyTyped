organization := "org.scalablytyped.slinky"
name := "angular__platform-browser-dynamic"
version := "8.2.14-8879f3"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "angular__compiler" % "8.2.14-6598c3",
  "org.scalablytyped.slinky" %%% "angular__core" % "8.2.14-9ae61a",
  "org.scalablytyped.slinky" %%% "inquirer" % "6.5-dt-20200226Z-234cdc",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200519Z-717070",
  "org.scalablytyped.slinky" %%% "rxjs" % "6.5.5-a158f0",
  "org.scalablytyped.slinky" %%% "rxjs-compat" % "6.5.5-1d035b",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0",
  "org.scalablytyped.slinky" %%% "through" % "0.0-unknown-dt-20200515Z-138488",
  "org.scalablytyped.slinky" %%% "typescript" % "3.9.3-13a0c9")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
