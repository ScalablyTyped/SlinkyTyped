organization := "org.scalablytyped.slinky"
name := "angular__platform-browser"
version := "8.2.14-b52677"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "angular__animations" % "8.2.14-273660",
  "org.scalablytyped.slinky" %%% "angular__common" % "8.2.14-296f5a",
  "org.scalablytyped.slinky" %%% "angular__compiler" % "8.2.14-9c0e17",
  "org.scalablytyped.slinky" %%% "angular__core" % "8.2.14-3027ac",
  "org.scalablytyped.slinky" %%% "inquirer" % "6.5-dt-20200226Z-1f145b",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200609Z-6ee82c",
  "org.scalablytyped.slinky" %%% "rxjs" % "6.5.5-3504e0",
  "org.scalablytyped.slinky" %%% "rxjs-compat" % "6.5.5-db78b9",
  "org.scalablytyped.slinky" %%% "std" % "3.9-dec240",
  "org.scalablytyped.slinky" %%% "through" % "0.0-unknown-dt-20200515Z-9f78d0",
  "org.scalablytyped.slinky" %%% "typescript" % "3.9.5-4f4ada")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
